![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

# Metodo bmi
1.- Comprobar enviando 5 pares de numeros con decimales positivos
2.- Comprobar enviando 5 pares de numeros sin decimales positivos
3.- Comprobar enviando 5 pares de numeros con decimales negativos
4.- Comprobar enviando 5 pares de numeros sin decimales negativos
5.- Comprobar que se pase mass = 0 (Deberia dar 0)
6.- Comprobar que se pase height = 0 (Deberia ocurrir error)

# Metodo category
1.- Comprobar 5 bmi que deban dar UNDERWEIGHT (Comprobando los casos limites, incluyendo con y sin decimales)
2.- Comprobar 5 bmi que deban dar NORMAL (Comprobando los casos limites, incluyendo con y sin decimales)
3.- Comprobar 5 bmi que deban dar OVERWEIGHT (Comprobando los casos limites, incluyendo con y sin decimales)
4.- Comprobar 5 bmi que deban dar OBESE (Comprobando los casos limites, incluyendo con y sin decimales)
5.- Comprobar enviar un numero negativo (Deberia dar UNDERWEIGHT)
6.- Comprobar enviar un cero (Deberia dar UNDERWEIGHT)

# Metodo abdominalObesity
1.- Comprobar enviar 'M'  y 5 waistCircumference para que de TRUE
2.- Comprobar enviar 'M'  y 5 waistCircumference para que de FALSE
3.- Comprobar enviar 'F'  y 5 waistCircumference para que de TRUE
4.- Comprobar enviar 'M'  y 5 waistCircumference para que de FALSE
5.- Comprobar que pasa si envio una 'm'
6.- Comprobar que pasa si envio una 'f'
7.- Comprabar que pasa si envio una letra distinto a M o F