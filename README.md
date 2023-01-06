# Portfolio-BackEnd

---

### Como hacer que funcione:

El MySQL de la app corre con XAMPP e el puerto 3308, para que funcione correctamente y cree las tablas, se necesita crear primero una base de datos MySQL con nombre: backendgem

Esto hay que hacerlo en el MySQL desde XAMPP, podes hacerlo ya sea desde el phpmyadmin de xampp, o el workbench de mysql conectado a xampp.

Tras realizar esto se debe dejar en start el MySQL desde xampp, y se procede a hacer un 'run' en el backend de java, para que cree las tablas necesarias.

Luego de haberse creado las tablas, se deberan crear 2 tipos de usuario para poder logearse luego (desde postman de ser posible para mas facilidad, o desde el mismo phpmyadmin): 

Link para postman: (POST) -> localhost:8080/auth/nuevo -> Body -> JSON

Admin:
{
    "nombre":"admin",
    "nombreUsuario":"admin",
    "email":"admin@admin.com",
    "password":"admin",
    "roles":["admin"]
}

User:
{
    "nombre":"user",
    "nombreUsuario":"user",
    "email":"user@user.com",
    "password":"user",
    "roles":["user"]
}


Ya a partir de aca queda todo listo, se va al frontend y se realiza un ng serve en la carpeta PortfolioEzequielGiampaoli o se dirige directamente a la pagina: https://frontend-argprog-c0f1e.web.app/
