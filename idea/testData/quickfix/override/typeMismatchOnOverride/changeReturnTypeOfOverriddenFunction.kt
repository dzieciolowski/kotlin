// "Change 'foo' function return type to 'Long'" "true"
interface A {
    fun foo(): Int
}

interface B {
    fun foo(): Number
}

interface C : A, B {
    override fun foo(): Long<caret>
}