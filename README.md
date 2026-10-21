# BIT235 Workshop 2 - Fundamental Programming Structures in Java

**Course:** BIT235 Object Oriented Programming
**Student:** Chen Zhihan (S1580887)
**Topic:** Variables - Primitive Datatypes and String

## Exercises

| File | Exercise | Description |
|------|----------|-------------|
| `Exercise1_1.java` | 1.1 | Difference of two integers entered by the user (Scanner) |
| `Exercise1_2.java` | 1.2 | Degrees Celsius to degrees Fahrenheit (F = C * 9/5 + 32) |
| `Exercise1_3.java` | 1.3 | Area of a circle (pi = 3.14, Math.pow) for several radii |
| `Exercise1_4.java` | 1.4 | Compound interest A = P * (1 + r)^n for P = 5000, r = 4%, n = 10 |
| `Exercise1_5.java` | 1.5 | Volume of the Earth, volume of the Sun and the Sun/Earth ratio |
| `Exercise1_6.java` | 1.6 | Fuel consumption on normal and rough roads with a 40 litre tank |
| `Exercise1_7.java` | 1.7 | Length and content of "I love java programming".substring(7, 11) |
| `Exercise1_8.java` | 1.8 | Compare two strings with equals() and compare their first characters |

## How to compile and run

```bash
javac Exercise1_1.java
java Exercise1_1
```

## Program output

The console output of every program is saved in the `output` folder.

### 1.1 Difference of two integers
```
Enter the first integer : 42
Enter the second integer: 15
First number  = 42
Second number = 15
Difference    = 42 - 15 = 27
```

### 1.2 Celsius to Fahrenheit
```
Enter the temperature in Celsius: 37
37.0 degrees Celsius = 98.6 degrees Fahrenheit
```

### 1.3 Area of a circle
```
Radius   Area of the circle
---------------------------
1.00     3.14
2.50     19.63
5.00     78.50
7.00     153.86
12.00    452.16
```

### 1.4 Compound interest
```
Principal (P)        : $5,000.00
Interest rate (r)    : 4% per year
Time period (n)      : 10 years
Amount (A)           : $7,401.22
Interest earned      : $2,401.22
```

### 1.5 Volumes of the Earth and the Sun
```
a.) Volume of the Earth : 229,730,773,333.33 cubic miles
b.) Volume of the Sun   : 338,708,987,083,333,300.00 cubic miles
c.) Sun / Earth ratio   : 1,474,373.60
```

### 1.6 Fuel consumption
```
Normal road consumption : 8.00 litres / 100 km
Rough road consumption  : 9.20 litres / 100 km
Distance on normal road : 500.00 km
Distance on rough road  : 434.78 km
```

### 1.7 Substring
```
Original string : I love java programming
substring(7, 11): "java"
Length          : 4
```

### 1.8 Comparing two strings
```
Enter the first string : Apple
Enter the second string: Apricot
Are the two given strings equal? false
First character of the first string : A
First character of the second string: A
Are the first characters equal? true
```