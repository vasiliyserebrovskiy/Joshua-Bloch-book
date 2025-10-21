## 💡 Main idea
Don’t expose fields directly in public classes — use accessor methods (getters/setters) instead.
If you make fields public, you break encapsulation and lose control over how your data is accessed or modified.
- Bad example:
```java
public class Point {
public double x;
public double y;
}
```
This class exposes its representation. If you later decide to change how coordinates are stored (e.g., using a Vector object), you’ll break all code that depends on it.
## 🔍 Key points
1. Public fields break encapsulation.
External code can freely modify your object’s state, bypassing validation.
2. Accessors provide flexibility and control.
 - You can validate inputs or enforce invariants.
 - You can refactor internal representation without breaking API.
 - You can add logic like caching or logging later.
3. Package-private or private nested classes can use public fields if it’s simpler and safe (they’re not part of the API).
4. Public classes should always hide their fields behind methods.

### 🧠 Summary
- Avoid exposing mutable fields directly.
- Use getter/setter methods for flexibility and safety.
- Preserve your class’s encapsulation — it’s easier to maintain and evolve.