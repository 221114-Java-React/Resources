# Access Modifiers

Are keywords that define which types and type members are accessible to certain parts of a project.
Defines visibilty/accessibility within the program itself.

3 access modifiers: public, protected, private
access levels: public, protected, private, default

_Public_ access modifier has a public access level, means that anywhere in the project, as long as you import it's package you can utilize this type or type member.

_Protected_ access modifier has a protected access level, means that this type member is only accessible to those that inherit from the parent type. Even child classes outside the package.

_Private_ access modifier has private access level, means that this type member is only accessible from within that type or from within the class it is declared in.

_Default_ access level doesn't have a corresponding access modifier. Like it's name describes, if you don't set up an access level for a type/type member, it has this level. AKA Package private, it's only accessible to types that belong in the same package.
