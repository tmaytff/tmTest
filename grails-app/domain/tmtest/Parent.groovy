package tmtest

class Parent {

    String uuid = UUID.randomUUID().toString()

    static hasMany = [children: Child]

    static constraints = {
    }
}
