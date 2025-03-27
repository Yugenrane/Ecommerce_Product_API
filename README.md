# E-commerce Product Management API

## Overview
A complete product and category management system with RESTful endpoints and MySQL integration.

## Features
✅ Product CRUD operations  
✅ Category management  
✅ Search & Filter: Find products by category, Search by name  
✅ Pagination support  
✅ Auto-generated REST API with Spring Data REST  

---

## 🏗️ Project Structure (Key Components)
```
src/
├── main/
│   ├── java/com/example/Ecommerce_product/
│   │   ├── entities/
│   │   │   ├── Product.java
│   │   │   ├── Category.java
│   │   ├── repositories/
│   │   │   ├── ProductRepository.java
│   │   │   ├── CategoryRepository.java
│   │   ├── services/
│   │   │   ├── ProductService.java
│   │   │   ├── CategoryService.java
│   │   ├── dto/
│   │   │   ├── ProductDTO.java
│   │   │   ├── CategoryDTO.java
│   │   ├── controllers/
│   │   │   ├── ProductController.java
│   │   │   ├── CategoryController.java
```

---

## 🚀 Core Endpoints
| Endpoint | Method | Request | Response | Description |
|----------|--------|---------|----------|-------------|
| `/api/products` | **POST** | `ProductDTO` | `ProductDTO` | Create a new product |
| `/api/products/{id}` | **GET** | `id` (Path Variable) | `ProductDTO` | Get product by ID |
| `/api/products` | **GET** | - | `List<ProductDTO>` | Get all products (Paginated) |
| `/api/products/search/findByNameContaining?name={name}` | **GET** | `name` (Query Param) | `List<ProductDTO>` | Search products by name |
| `/api/categories` | **POST** | `CategoryDTO` | `CategoryDTO` | Create a new category |
| `/api/categories/{id}` | **GET** | `id` (Path Variable) | `CategoryDTO` | Get category by ID |
| `/api/categories` | **GET** | - | `List<CategoryDTO>` | Get all categories |

---

## 🔧 Service Layer
Key services include:
- Product and category persistence
- Search & filter functionality
- Auto-generated Spring Data REST endpoints

---

## ⚙️ Tech Stack
- **Backend**: Spring Boot 3.4.2 + JPA
- **Database**: MySQL (JPA repositories)
- **Architecture**: Repository pattern + DTOs

---

## 🛠️ Setup
1. **Configure MySQL** in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=Yugen@1998
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

2. **Start the application**:
```bash
mvn spring-boot:run
```

---

## 📄 License
MIT © 2024

