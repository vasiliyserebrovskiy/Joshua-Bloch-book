## Main idea
Encapsulation is the foundation of reliable and maintainable code. Keep everything as private as possible and expose only what is necessary.

### In simpler terms:
The less the outside world knows about the internal structure of your code, the easier it is to change it without breaking other parts of the program.

## 💡 Key principles
- Every class, method, field, and constructor should have the lowest possible level of access.
- By default — use private.
- Increase visibility (package-private, protected, public) only when truly necessary.

## Encapsulation helps to:
- Protect internal state from unwanted modifications.
- Avoid tight coupling between different parts of the program.
- Simplify testing and maintenance.
- Allow changes to internal implementation without breaking the external API.

API is a contract between your class and the rest of the codebase.
Everything you make public becomes part of that contract and limits your freedom to change it later.

## 🧠 Key takeaways
- Always start with the least visibility — private → package-private → protected → public.
- Never make fields public.
- Hide internal classes (use nested classes if you need to restrict their visibility).
- Anything that is public is forever — it becomes part of your API, and changing it later will be difficult because other modules may depend on it.

### 🔒 Java Access Modifiers Overview

Access modifiers in Java define how accessible a class, method, constructor, or variable is from other parts of the code. They help implement encapsulation — one of the core principles of object-oriented programming.

1. private
   - Visibility: Only within the same class.
   - Usage: The most restrictive modifier — ideal for hiding internal data or helper methods.
   - Example:
```java
   private int balance;
   private void recalculate() { ... }
   ```
   When to use: Always start with private unless wider access is truly necessary.
2. (default) — Package-private
   - Visibility: Within the same package (no keyword required).
   - Usage: Accessible by any class in the same package, but not outside it.
   - Example:
   ```java
   String formatDate(Date date) { ... }
   ```
   When to use: For internal utilities or classes that are only relevant within one package.
3. protected
   - Visibility: Same package and subclasses (even if they are in different packages).
   - Usage: Often used in inheritance when you want to give limited access to child classes.
   - Example:
```java
   protected void validate() { ... }
   ```
   When to use: For methods or fields meant to be overridden or accessed by subclasses.

4. public
   - Visibility: Everywhere — accessible from any other class or package.
   - Usage: Used for the parts of your API intended for external use.
   - Example:
```java
   public class UserService { ... }
   public void saveUser(User user) { ... }
   ```
   When to use: For stable, well-defined interfaces or classes meant to be used by others.

  ## 🧠 Best Practice Summary

   - Start with the most restrictive modifier (private) and relax access only if necessary.
   - Avoid making fields public. Instead, use getters/setters if external access is needed.
   - Keep implementation details hidden; only expose what’s part of your intended API.
   - Remember: everything public becomes a contract that’s hard to change later.