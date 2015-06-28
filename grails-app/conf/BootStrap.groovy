import grails.converters.JSON
import tmtest.Child
import tmtest.Parent

class BootStrap {

    def init = { servletContext ->

        def parent = new Parent()
        def child1 = new Child(parent: parent, parentUuid: parent.uuid, childName: 'child1')
        def child2 = new Child(parent: parent, parentUuid: parent.uuid, childName: 'child2')
        parent.children = [child1,child2]

        //persist all
        parent.save(flush: true)
        child1.save(flush: true)
        child2.save(flush: true)

        //detach from session, so it won't save changes
        parent.discard()
        child1.discard()
        child2.discard()

        //remove id's
        parent.id = null
        child1.id = null
        child2.id = null

        println parent as JSON



    }
    def destroy = {
    }
}
