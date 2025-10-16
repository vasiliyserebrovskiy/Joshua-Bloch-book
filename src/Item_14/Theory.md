### In short — the essence
Object.clone() performs field-by-field copying of an object — a bitwise or shallow copy of references.

The Cloneable interface is a marker interface. If a class does not implement Cloneable, calling Object.clone() will throw a CloneNotSupportedException.

The clone() method in Object is protected, so it must be overridden and is usually made public.

Problems with clone(): unpredictable behavior with inheritance, difficulty in creating deep copies, broken invariants, issues with final fields, and the risk of partial or incorrect copying.

Joshua Bloch’s recommendation: avoid Cloneable whenever possible and use a copy constructor or a factory method instead.
If you do implement clone(), do it carefully: call super.clone(), clone mutable fields, and respect the contract.

### Key points for implementing clone() correctly
- Call super.clone() to create the base shallow copy.
- Clone all mutable and nested objects (and collections — create new ones and copy or clone their elements).
- Make clone() public (as a rule).
- Handle CloneNotSupportedException — usually by converting it to an AssertionError, since if your class implements Cloneable, this exception should never occur.

### Advantages of a copy constructor or factory
- Clarity: the code is easy to read and understand.
- No need to implement Cloneable or worry about super.clone() and CloneNotSupportedException.
- Easier to control deep vs. shallow copying and maintain class invariants.
- Works better with final fields (which can be initialized directly in the constructor).

### Additional notes (from Effective Java)
If a class implements Cloneable, it should:
- Override clone() as public, returning the covariant type (the class itself).
- Call super.clone() and then adjust or clone fields as needed.
- Not rely on Object.clone() for complex invariants — ensure the cloned object is valid.
- Avoid Cloneable for inheritance — subclasses may require different clone() behavior, which is easy to break.
- Clearly document whether cloning is shallow or deep, so users know what to expect.
- For collections: create new collections and clone their elements if necessary.
(ArrayList.clone() performs a shallow copy — it copies the internal array, but not the elements themselves.)

### What to choose in most cases?
A copy constructor or a static factory method is the preferred, safe, and clear approach.
clone() can be used if necessary, but only with careful implementation — in most cases, it causes more trouble than it’s worth.
For immutable objects, cloning is not needed at all — just create new instances or reuse existing ones, since immutability makes them safe to share.