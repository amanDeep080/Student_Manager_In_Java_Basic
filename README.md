<!-- =======================
✨ Student Manager (Full Stack)
Spring Boot + JDBC + PostgreSQL + Frontend
======================= -->

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Poppins&weight=700&size=26&duration=2500&pause=700&color=22C55E&center=true&vCenter=true&width=900&lines=Student+Manager+%F0%9F%8E%93;Spring+Boot+%2B+JDBC+%2B+PostgreSQL+%2B+Frontend;Add+%2F+View+%2F+Delete+Students+in+Seconds" alt="Typing SVG" />

<br/>

<img src="https://img.shields.io/badge/Spring%20Boot-3.x-22C55E?style=for-the-badge&logo=springboot&logoColor=white" />
<img src="https://img.shields.io/badge/Java-17%2B-2563EB?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/JDBC-Template-F97316?style=for-the-badge" />
<img src="https://img.shields.io/badge/PostgreSQL-5432-0EA5E9?style=for-the-badge&logo=postgresql&logoColor=white" />
<img src="https://img.shields.io/badge/Frontend-HTML%20%7C%20CSS%20%7C%20JS-8B5CF6?style=for-the-badge&logo=javascript&logoColor=white" />

<br/><br/>

> A beginner-friendly **full-stack** project where the frontend (HTML/JS) calls Spring Boot REST APIs using **JDBC + PostgreSQL**.

</div>

---

## ✨ Features
- ✅ Add Student (Name, Email, Course)
- ✅ View All Students
- ✅ Delete Student
- ✅ Frontend UI included (no separate React setup)

---

## 🧰 Tech Stack
- **Backend:** Spring Boot (REST API)
- **Database:** PostgreSQL
- **DB Access:** JdbcTemplate (JDBC)
- **Frontend:** HTML + CSS + JavaScript (`fetch()`)



## 📁 Project Structure

student-manager/
 ├─ src/main/java/com/example/demo/
 │   ├─ StudentManagerApplication.java
 │   ├─ controller/StudentController.java
 │   ├─ model/Student.java
 │   ├─ repository/StudentRepository.java
 │   └─ service/StudentService.java
 ├─ src/main/resources/
 │   ├─ static/
 │   │   ├─ index.html
 │   │   ├─ style.css
 │   │   └─ app.js
 │   └─ application.properties
 └─ pom.xml

 ✅ Requirements

Java 17+ (works with Java 21 too)

Maven

PostgreSQL installed + running

Any IDE (Eclipse / IntelliJ / VS Code)

🗄️ Database Setup (PostgreSQL)
1) Create Table (run in pgAdmin / psql)
CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(120) NOT NULL UNIQUE,
    course VARCHAR(100) NOT NULL
);
2) Configure Spring Boot DB Connection

Open: src/main/resources/application.properties and set your password:

spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD

⚠️ Tip: If you created a different database (example: student_db), update the URL:

spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
▶️ Run the Project
Option A: Run from Eclipse

Right click project → Run As → Spring Boot App

App starts on:

✅ http://localhost:8080

Option B: Run from Terminal

In project root:

mvn spring-boot:run
🌐 Open Frontend (UI)

After backend starts, open:

✅ Frontend URL:
➡️ http://localhost:8080/index.html

🔥 API Testing (No Confusion)
✅ 1) Get All Students

GET

http://localhost:8080/api/students

cURL

curl http://localhost:8080/api/students
✅ 2) Add Student

POST

http://localhost:8080/api/students

Body (JSON)

{
  "name": "Amandeep",
  "email": "aman@gmail.com",
  "course": "Java"
}

cURL

curl -X POST http://localhost:8080/api/students \
  -H "Content-Type: application/json" \
  -d "{\"name\":\"Amandeep\",\"email\":\"aman@gmail.com\",\"course\":\"Java\"}"
✅ 3) Delete Student

DELETE

http://localhost:8080/api/students/{id}

Example:

http://localhost:8080/api/students/3

cURL

curl -X DELETE http://localhost:8080/api/students/3
🧪 Verify in PostgreSQL (Optional)

Run:

SELECT * FROM students ORDER BY id DESC;
🛠️ Common Issues + Fixes (So No One Gets Stuck)
❌ 1) “Connection refused” / DB not connecting

✅ Fix:

Start PostgreSQL service

Check port 5432

Confirm username/password in application.properties

❌ 2) Port 8080 already in use

✅ Fix:
Change port in application.properties:

server.port=8081

Then open frontend:

http://localhost:8081/index.html

❌ 3) Tests show red errors but app runs

✅ Fix:
Add this dependency in pom.xml (tests):

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-test</artifactId>
  <scope>test</scope>
</dependency>

Then in Eclipse:

Right click project → Maven → Update Project

Project → Clean

(Or delete src/test/java if you don’t want tests.)

📸 Screenshots (Optional but recommended)

Create a folder screenshots/ and add:

screenshots/ui.png

screenshots/postman.png

Then add in README:

![UI](screenshots/ui.png)
![Postman](screenshots/postman.png)
🚀 Future Improvements (Optional)

Update Student (PUT)

Validation (NotBlank, Email)

Search by name

Pagination

Login system

Bootstrap UI

👤 Author

Amandeep Kumar

Project: Student Manager

<div align="center">
⭐ If you like this project, give it a star ⭐
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExZTRhM2M0YTY2YjE0ZDE0NzA3N2I1Y2U4Y2M3NjE5N2UxYjY0N2E1MSZjdD1n/26ufdipQqU2lhNA4g/giphy.gif" width="420"/> </div>
