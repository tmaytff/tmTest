package tmtest

class Child {

    static belongsTo = [parent: Parent]

    String parentUuid
    String childName

    static constraints = {
    }
}
