<!-- =======================
🚀 STUDENT MANAGER PRO EDITION
Spring Boot + JDBC + PostgreSQL + Frontend
======================= -->

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Montserrat&weight=700&size=28&duration=2500&pause=700&color=00C853&center=true&vCenter=true&width=1000&lines=Student+Manager+Full+Stack+Application;Spring+Boot+%7C+JDBC+%7C+PostgreSQL+%7C+Frontend;Production-Ready+Beginner+Project" />

<br/>

<img src="https://img.shields.io/badge/Spring%20Boot-3.x-00C853?style=for-the-badge&logo=springboot&logoColor=white" />
<img src="https://img.shields.io/badge/Java-17+-FF6F00?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/PostgreSQL-5432-1976D2?style=for-the-badge&logo=postgresql&logoColor=white" />
<img src="https://img.shields.io/badge/JDBC-Template-9C27B0?style=for-the-badge" />
<img src="https://img.shields.io/badge/REST-API-FF1744?style=for-the-badge" />

<br/><br/>

💡 A complete **Full-Stack Student Management System** built using  
Spring Boot + JDBC + PostgreSQL + HTML/CSS/JS frontend.

</div>

---

# 🏗️ System Architecture

```
┌───────────────────────────┐
│        Frontend           │
│   HTML + CSS + JS         │
│  (Fetch API Calls)        │
└─────────────┬─────────────┘
              │ HTTP
┌─────────────▼─────────────┐
│      Spring Boot API      │
│  Controller → Service →   │
│       Repository (JDBC)   │
└─────────────┬─────────────┘
              │ SQL
┌─────────────▼─────────────┐
│       PostgreSQL DB       │
└───────────────────────────┘
```

---

# ✨ Features

- ✅ Add Student
- ✅ View All Students
- ✅ Delete Student
- ✅ REST API Endpoints
- ✅ PostgreSQL Integration
- ✅ Clean MVC Architecture
- ✅ Production-ready structure

---

# 📁 Project Structure

```
student-manager/
 ├── src/main/java/com/example/demo/
 │    ├── StudentManagerApplication.java
 │    ├── controller/
 │    ├── service/
 │    ├── repository/
 │    └── model/
 │
 ├── src/main/resources/
 │    ├── static/
 │    │    ├── index.html
 │    │    ├── style.css
 │    │    └── app.js
 │    └── application.properties
 │
 └── pom.xml
```

---

# 🛠️ Tech Stack

| Layer       | Technology |
|------------|------------|
| Backend     | Spring Boot |
| Database    | PostgreSQL |
| Data Access | JdbcTemplate |
| Frontend    | HTML + CSS + JS |
| Build Tool  | Maven |

---

# ⚙️ Installation Guide (Zero Confusion Setup)

## 1️⃣ Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/student-manager.git
cd student-manager
```

---

## 2️⃣ Setup PostgreSQL

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

## 3️⃣ Configure Database

Edit:

```
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
```

---

## 4️⃣ Run Application

### From Eclipse
Right Click → Run As → Spring Boot App

### From Terminal

```bash
mvn spring-boot:run
```

App runs at:

```
http://localhost:8080
```

---

# 🌐 Frontend Access

Open:

```
http://localhost:8080/index.html
```

---

# 🔥 API Documentation

---

## 📌 Get All Students

```
GET http://localhost:8080/api/students
```

---

## 📌 Add Student

```
POST http://localhost:8080/api/students
```

Body:

```json
{
  "name": "Amandeep",
  "email": "aman@gmail.com",
  "course": "Java"
}
```

---

## 📌 Delete Student

```
DELETE http://localhost:8080/api/students/{id}
```

Example:

```
DELETE http://localhost:8080/api/students/3
```

---

# 🧪 Testing via cURL

```bash
curl http://localhost:8080/api/students
```

```bash
curl -X POST http://localhost:8080/api/students \
-H "Content-Type: application/json" \
-d "{\"name\":\"Aman\",\"email\":\"aman@gmail.com\",\"course\":\"Java\"}"
```

```bash
curl -X DELETE http://localhost:8080/api/students/1
```

---

# 📊 Database Verification

```sql
SELECT * FROM students ORDER BY id DESC;
```

---

# 🚨 Troubleshooting

### ❌ PostgreSQL connection failed
✔ Ensure PostgreSQL service is running  
✔ Check port 5432  
✔ Check credentials  

---

### ❌ Port 8080 already in use
Add in properties:

```properties
server.port=8081
```

Then access:

```
http://localhost:8081/index.html
```

---

### ❌ Red errors in test folder
Add to pom.xml:

```xml
<dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-test</artifactId>
 <scope>test</scope>
</dependency>
```

Then:
Maven → Update Project → Clean

---

# 🚀 Future Enhancements

- Update API (PUT)
- Validation
- Search by name
- Pagination
- Authentication
- Bootstrap UI
- JWT Security

---

# 👨‍💻 Author

**Amandeep Kumar**  
B.Tech CSE  
Full-Stack Java Developer 🚀

---

<div align="center">

### ⭐ If you found this helpful, give this repo a Star ⭐

<img src="https://media.giphy.com/media/3o7aD2saalBwwftBIY/giphy.gif" width="400">

</div>
