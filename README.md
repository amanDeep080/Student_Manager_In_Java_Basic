<!-- =======================
✨ Student Manager (Full Stack)
Spring Boot + JDBC + PostgreSQL + Frontend
======================= -->

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Poppins&weight=700&size=26&duration=2500&pause=700&color=22C55E&center=true&vCenter=true&width=900&lines=Student+Manager+%F0%9F%8E%93;Spring+Boot+%2B+JDBC+%2B+PostgreSQL+%2B+Frontend;Add+%2F+View+%2F+Delete+Students+in+Seconds" />

<br/>

<img src="https://img.shields.io/badge/Spring%20Boot-3.x-22C55E?style=for-the-badge&logo=springboot&logoColor=white" />
<img src="https://img.shields.io/badge/Java-17%2B-2563EB?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/JDBC-Template-F97316?style=for-the-badge" />
<img src="https://img.shields.io/badge/PostgreSQL-5432-0EA5E9?style=for-the-badge&logo=postgresql&logoColor=white" />
<img src="https://img.shields.io/badge/Frontend-HTML%20%7C%20CSS%20%7C%20JS-8B5CF6?style=for-the-badge&logo=javascript&logoColor=white" />

<br/><br/>

> A beginner-friendly full-stack project where frontend (HTML/JS) connects to Spring Boot REST APIs using JDBC + PostgreSQL.

</div>

---

# ✨ Features

- ✅ Add Student
- ✅ View All Students
- ✅ Delete Student
- ✅ REST API
- ✅ PostgreSQL Integration
- ✅ Frontend UI included

---

# 🧰 Tech Stack

Backend:
- Spring Boot
- JdbcTemplate
- PostgreSQL

Frontend:
- HTML
- CSS
- JavaScript (Fetch API)

---

# 📁 Project Structure

```
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
```

---

# ✅ Requirements

- Java 17+
- Maven
- PostgreSQL installed & running
- Eclipse / IntelliJ

---

# 🗄️ Database Setup (PostgreSQL)

Open pgAdmin → Query Tool → Run:

```sql
CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(120) NOT NULL UNIQUE,
    course VARCHAR(100) NOT NULL
);
```

---

# ⚙️ Configure Database

Open:

```
src/main/resources/application.properties
```

Set:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
```

If using different DB:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
```

---

# ▶️ Run the Application

## From Eclipse
Right Click Project → Run As → Spring Boot App

## From Terminal

```bash
mvn spring-boot:run
```

Server starts at:

```
http://localhost:8080
```

---

# 🌐 Open Frontend

```
http://localhost:8080/index.html
```

---

# 🔥 API Testing Guide

## 1️⃣ Get All Students

GET

```
http://localhost:8080/api/students
```

cURL:

```bash
curl http://localhost:8080/api/students
```

---

## 2️⃣ Add Student

POST

```
http://localhost:8080/api/students
```

Body:

```json
{
  "name": "Amandeep",
  "email": "aman@gmail.com",
  "course": "Java"
}
```

cURL:

```bash
curl -X POST http://localhost:8080/api/students \
  -H "Content-Type: application/json" \
  -d "{\"name\":\"Amandeep\",\"email\":\"aman@gmail.com\",\"course\":\"Java\"}"
```

---

## 3️⃣ Delete Student

DELETE

```
http://localhost:8080/api/students/{id}
```

Example:

```
http://localhost:8080/api/students/3
```

cURL:

```bash
curl -X DELETE http://localhost:8080/api/students/3
```

---

# 🧪 Verify Data in PostgreSQL

```sql
SELECT * FROM students ORDER BY id DESC;
```

---

# 🛠️ Common Issues + Fix

## ❌ Database not connecting
- Ensure PostgreSQL is running
- Check port 5432
- Check username/password

## ❌ Port 8080 already in use

Change port:

```properties
server.port=8081
```

Then open:

```
http://localhost:8081/index.html
```

## ❌ Test errors but app runs

Add in pom.xml:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-test</artifactId>
  <scope>test</scope>
</dependency>
```

Then:
- Maven → Update Project
- Project → Clean

Or delete `src/test/java` folder.

---

# 🚀 Future Improvements

- Update Student
- Validation
- Search
- Pagination
- Login System
- Bootstrap UI

---

# 👨‍💻 Author

Amandeep Kumar  
Project: Student Manager

---

<div align="center">

⭐ If you like this project, give it a star ⭐

</div>
