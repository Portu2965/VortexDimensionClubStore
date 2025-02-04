# VortexDimensionClub - Sistema de Gestión de Tienda de Ropa

## Descripción
VortexDimensionClub es una aplicación Java que gestiona el inventario de una tienda de ropa utilizando MongoDB como base de datos NoSQL. El sistema está diseñado para manejar productos con múltiples variantes, seguimiento de stock y estadísticas de ventas.

## Tecnologías
- Java 23
- MongoDB
- Maven
- MongoDB Java Driver
- SLF4J (Logging)

## Estructura del Proyecto
```
vortex-dimension-club/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── vortexdimension/
│   │   │   │       ├── model/
│   │   │   │       │   ├── Producto.java
│   │   │   │       │   └── Model.java
│   │   │   │       ├── util/
│   │   │   │       │   └── ConnectionManager.java
│   │   │   │       └── Main.java
│   │   └── resources/
│   │       └── log4j.properties
└── pom.xml
```

## Estructura de la Base de Datos

### Colección: productos
```javascript
{
  "_id": ObjectId,
  "codigo": String,
  "nombre": String,
  "tipo": String,
  "precio": Number,
  "fechaAlta": Date,
  "stock": {
    "disponible": Number,
    "vendido": Number,
    "reservado": Number
  },
  "detalles": {
    "marca": String,
    "coleccion": String,
    "material": String,
    "cuidados": [String],
    "etiquetas": [String]
  },
  "variantes": [{
    "color": String,
    "talla": String,
    "stock": Number,
    "sku": String
  }],
  "imagenes": [{
    "url": String,
    "color": String,
    "principal": Boolean
  }],
  "stats": {
    "visitas": Number,
    "ventas": Number,
    "ultimaVenta": Date
  },
  "estado": String
}
```

## Configuración

### Prerrequisitos
- JDK 17 o superior
- MongoDB 6.0 o superior
- Maven 3.6 o superior

### Instalación


## Características

### Gestión de Productos
- Registro de productos con múltiples variantes
- Control de stock por talla y color
- Seguimiento de estadísticas de ventas
- Gestión de imágenes por color

### Control de Inventario
- Seguimiento de stock disponible
- Control de productos reservados
- Historial de ventas
- Estadísticas de visitas y ventas

### Búsqueda y Filtrado
- Búsqueda por tipo de producto
- Filtrado por fechas
- Búsqueda por SKU
- Filtrado por estado

