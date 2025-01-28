# Patrons de Disseny en Java II 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte aprofundeix en els patrons de construcció de programari utilitzant Java. S'exploren els patrons Builder, Observer i Callback a través d'exercicis pràctics dividits en tres nivells. L'objectiu és entendre com implementar patrons per estructurar millor el programari.

### Nivell 1 ⭐
#### Exercici 1: Builder
Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder.

- **Funcionalitat**:
  - Crear pizzes amb diferents configuracions de mida, tipus de massa i ingredients.
  - Definir una classe `Pizza` amb els atributs:
    - `size` (mida)
    - `dough` (tipus de massa)
    - `toppings` (ingredients)
  - Crear una interfície `PizzaBuilder` amb mètodes per configurar les propietats de la pizza.
  - Implementar constructors concrets (`PizzaBuilder`) per a diferents tipus de pizzes, com pizza hawaiana o vegetariana.
  - Desenvolupar una classe `MestrePizzer` que rebi un `PizzaBuilder` per construir pizzes específiques.

- **Requisits**:
  - Crear un projecte Gradle amb una classe `Main` que demostri l'ús del patró Builder.
  - Utilitzar la classe `MestrePizzer` i instàncies de `PizzaBuilder` per construir pizzes amb diferents configuracions.

---

### Nivell 2 ⭐⭐
#### Exercici 1: Observer
Dissenya un sistema on un Agent de Borsa (Observable) notifiqui a diverses agències de borsa (Observers) sobre canvis en el mercat.

- **Funcionalitat**:
  - L'objecte `AgentDeBorsa` ha de mantenir referències als seus `Observers`.
  - Quan el mercat pugi o baixi, l'Agent de Borsa ha de notificar als seus `Observers`.

- **Requisits**:
  - Crear un projecte Gradle amb una classe `Main` que mostri l'ús del patró Observer.
  - Implementar el patró Observable per gestionar la notificació d'esdeveniments als Observers.

---

### Nivell 3 ⭐⭐⭐
#### Exercici 1: Callback
Simula una passarel·la de pagament que utilitzi el patró Callback.

- **Funcionalitat**:
  - Rebre un objecte encapsulador del mètode de pagament, que pot ser:
    - Targeta de crèdit
    - Paypal
    - Deute en compte bancari
  - La passarel·la de pagament ha d'invocar el pagament sense conèixer la implementació específica i retornar el control a la classe d'origen.
  - La classe que invoca la passarel·la de pagament serà una botiga de sabates.

- **Requisits**:
  - Crear un projecte Gradle amb una classe `Main` que mostri l'ús del patró Callback.
  - Assegurar-se que la passarel·la de pagament pot gestionar diferents mètodes de pagament de manera genèrica.

---

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Gradle
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Gradle configurat al sistema
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/3.2-Patterns2.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
