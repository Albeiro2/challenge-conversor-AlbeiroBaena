# 💱 Conversor de Monedas - Java

Este proyecto es una aplicación de consola en Java que permite convertir entre varias monedas en tiempo real utilizando una API externa. El programa obtiene el tipo de cambio actualizado y realiza la conversión solicitada por el usuario, manejando errores comunes como entradas inválidas.

## 📌 Funcionalidades

- Conversión entre monedas usando tasas reales desde una API.
- Manejo de excepciones para entradas no válidas.
- Menú interactivo por consola.
- Uso de `Gson` para parseo de JSON.
- Conexión HTTP con API externa para obtener tasas de cambio.

## 🔁 Conversiones implementadas

1. Dólar 🇺🇸 ➡️ Peso argentino 🇦🇷  
2. Peso argentino 🇦🇷 ➡️ Dólar 🇺🇸  
3. Dólar 🇺🇸 ➡️ Real brasileño 🇧🇷  
4. Real brasileño 🇧🇷 ➡️ Dólar 🇺🇸  
5. Dólar 🇺🇸 ➡️ Peso colombiano 🇨🇴  
6. Peso colombiano 🇨🇴 ➡️ Dólar 🇺🇸

## 🛠️ Tecnologías usadas

- Java 17+
- [Gson](https://github.com/google/gson) para deserialización de JSON
- API de conversión de monedas ExchangeRate API
- IDE: IntelliJ IDEA

- 📄 Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más información.
👨‍💻 Autor

Desarrollado por Albeiro Baena como práctica de consumo de APIs, manejo de excepciones y estructuras de control en Java para Alura Latam.

-Nota: Agregar el archivo jar de gson al proyecto para el funcionamiento del programa
