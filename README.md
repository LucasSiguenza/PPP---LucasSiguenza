# 🏨 Sistema de Servicios de Hospedaje y Gastronomía

---

## Alumno
**Nombre del alumno**: Lucas G. Sigüenza.

## 📄 Descripción del Proyecto

Este proyecto es un sistema de gestión diseñado para servicios de hospedaje y gastronomía, implementando conceptos de Programación Orientada a Objetos (POO) en Java. El objetivo es crear una aplicación que permita gestionar estos servicios, calcular precios finales con promociones, y validar atributos mediante excepciones cuando sea necesario.

### Objetivos
- Implementar un modelo orientado a objetos que refleje la gestión de servicios de hospedaje y gastronomía.
- Aplicar promociones y descuentos de forma dinámica.
- Validar la integridad de los datos utilizando excepciones adecuadas.

## 🛠️ Funcionalidades del Sistema

El sistema ofrece las siguientes funcionalidades:

### 1. Gestión de Hospedaje
- **Tipos de Habitaciones**: Administración de habitaciones estándar y deluxe.
- **Servicios Adicionales**: Opción de agregar servicios de limpieza y desayuno.
- **Aplicación de Descuentos**: Descuentos aplicables según la duración de la estadía.

### 2. Gestión de Gastronomía
- **Menús**: Posibilidad de agregar diferentes tipos de menús para los servicios de alimentación.
- **Cálculo de Precios**: Precios ajustables con descuentos según el tipo de comida y el día de la semana.

### 3. Promociones y Descuentos
- Implementación de promociones para estadías prolongadas.
- Penalizaciones por no cumplir con los requisitos establecidos, como el número mínimo de noches.

### 4. Validaciones
- Manejo de excepciones para situaciones como códigos duplicados, valores inválidos, y violaciones de las restricciones de negocio.

### 5. Cálculo de Precio Final
- Método para calcular el precio final del servicio, que incluye todas las promociones y servicios adicionales seleccionados.

## 📦 Estructura del Proyecto

El proyecto está compuesto por las siguientes clases y subclases:

### 1. **Servicio** (Clase Abstracta)
- **Atributos**:
   - `codigo`: Código del servicio.
   - `nombre`: Nombre del servicio.
   - `precioBase`: Precio base del servicio.
- **Métodos Abstractos**:
   - `calcularPrecioFinal()`: Método que debe ser implementado en las subclases para calcular el precio final del servicio.

### 2. **Hospedaje** (Subclase de Servicio)
- **Atributos Específicos**:
   - `numeroNoches`: Número de noches reservadas.
   - `servicioLimpieza`: Indica si se incluye el servicio de limpieza.
   - `desayuno`: Indica si se incluye el desayuno.
   - `tarifaExtra`: Tarifa adicional por servicios extras.
   - `promociones`: Lista de promociones aplicables.
- **Métodos**:
   - `calcularPrecioTotal()`: Calcula el precio total basado en el número de noches, promociones y servicios adicionales.

### 3. **Gastronomía** (Subclase de Servicio)
- **Atributos Específicos**:
   - `tipoMenu`: Tipo de menú seleccionado (desayuno, almuerzo, cena).
   - `diaSemana`: Día de la semana en que se solicita el servicio.
   - `aplicaDescuento`: Indica si se aplica un descuento.
- **Métodos**:
   - `calcularPrecioFinal()`: Calcula el precio final de acuerdo con el menú y las promociones disponibles.

### 4. **EDiasSemana** (Enum)
- **Lista Enumerados**:
     -`EDiaSemana`: Un enumerado con el tipo de dato DayOfWeek correspondiente a cada día.
- **Atributos**:
     -`dia`: variable que almacena el enumerado correspondiente al día de la semana y permite que estos elementos sean del tipo DayOfWeek.
-**Métodos**:
     -`diaActual()`: Compara la fecha LocalDate enviada por parámetro y le asigna un valor DayOfWeek correspondiente al enumerado de su fecha. De no encontrar lanza un IllegalArgumenteExeption.
  
### 5 **Sistema**(Clase)
-**Atributos específicos**:
      -`lstServicios`: Lista de servicios habidos.
-**Constructores**:
      -`Vacío`: Utilizado para instanciar la lista en caso de no haberla.
      -`Con List<Servicio>`: En caso de ya haber una lista que quiera ser gestionada por sistema.
-**Métodos**:
      -`traerServicio()`: Posee tres(3) formas, en las cuales puede traer un servicio por código, otra por estado de promoción, y finalmente una por estado de promoción y un localDate.
      -`agregarGastronomia()`: Permite crear un objeto del tipo Gastronomia, y, de no hayarse en la lista, lo añade.
      -`agregarHospedaje()`: Permite crear un objeto del tipo Hospedaje, y, de no encontrarse en la lista, es añadido.
