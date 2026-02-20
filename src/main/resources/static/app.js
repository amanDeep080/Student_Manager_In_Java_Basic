const API = "http://localhost:8080/api/students";

async function loadStudents() {
  const res = await fetch(API);
  const data = await res.json();

  const body = document.getElementById("studentsBody");
  body.innerHTML = "";

  data.forEach(s => {
    const tr = document.createElement("tr");
    tr.innerHTML = `
      <td>${s.id}</td>
      <td>${s.name}</td>
      <td>${s.email}</td>
      <td>${s.course}</td>
      <td><button onclick="deleteStudent(${s.id})">Delete</button></td>
    `;
    body.appendChild(tr);
  });
}

async function addStudent() {
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const course = document.getElementById("course").value.trim();

  if (!name || !email || !course) {
    document.getElementById("msg").innerText = "Fill all fields!";
    return;
  }

  const res = await fetch(API, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ name, email, course })
  });

  const text = await res.text();
  document.getElementById("msg").innerText = text;

  document.getElementById("name").value = "";
  document.getElementById("email").value = "";
  document.getElementById("course").value = "";

  loadStudents();
}

async function deleteStudent(id) {
  await fetch(`${API}/${id}`, { method: "DELETE" });
  loadStudents();
}

// auto load on page open
loadStudents();