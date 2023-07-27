fun main(args: Array<String>) {
    deretAngka()
}

fun deretAngka() {

    val listAngka: MutableList<String> = mutableListOf()
    for(index in 100 downTo 1) {
        if (!checkPrimary(index)) {
            listAngka.add(insertItem(index))
        }
    }

    listAngka.forEach {
        print("$it, ")
    }

}

fun checkPrimary(index:Int):Boolean {
    if (index >= 1) {
        for (number in 2..index) {
            if (number != index) {
                if(index % number == 0) {
                    return false
                }
            }
        }
    }
    if (index == 1) {
        return false
    }
    return true
}

fun insertItem(index: Int):String {
    if (index % 3 == 0 &&
        index % 5 == 0) {
        return "FooBar"
    } else if (index % 3 == 0) {
        return "Foo"
    } else if (index % 5 == 0) {
        return "Bar"
    } else {
        return index.toString()
    }
}



