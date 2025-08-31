# Programa Java Básico (Entrada/Salida por consola)

## Objetivo
Desarrollar y ejecutar un programa en Java **sin IDE**, usando `javac` y `java`, que solicite datos por teclado con `Scanner(System.in)` y los muestre por pantalla con `System.out`.

## Requisitos previos
- JDK 8+ instalado (`java -version`, `javac -version`).
- Consola/Terminal.

## Estructura
archivos_java/
├─ src/Main.java
├─ src/Main.class
└─ README.md

## Compilación y ejecución
```bash
javac src\Main.java
java -cp src Main

# 4) Listado de requisitos (funcionales y no funcionales)

## 4.1 Requisitos funcionales
1. RF-01: El sistema debe permitir ingresar **Marca** (String).
2. RF-02: El sistema debe permitir ingresar **Modelo** (String).
3. RF-03: El sistema debe permitir ingresar **Cilindrada** (int, en CC).
4. RF-04: El sistema debe permitir ingresar **Tipo de Combustible** (String).
5. RF-05: El sistema debe permitir ingresar **Capacidad en Pasajeros** (int).
6. RF-06: El sistema debe **mostrar** los datos ingresados en el formato solicitado.
7. RF-07: El sistema debe ejecutarse por consola usando **JVM** estándar.

## 4.2 Requisitos no funcionales
1. RNF-01: El programa debe compilar con **JDK 8+**.
2. RNF-02: El código debe estar **comentado en todas sus líneas**.
3. RNF-03: La interacción debe ser **clara** (mensajes de entrada y salida).
4. RNF-04: La ejecución debe realizarse por **línea de comandos** sin IDE.
5. RNF-05: El repositorio debe contener **README** con pasos reproducibles.
6. RNF-06: Estructura simple y portable (sin dependencias externas).