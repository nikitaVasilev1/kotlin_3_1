fun main(args: Array<String>) {
    print("Введите время, сколько человек был в сети назад в секуднах: ")
    var sec = readLine()!!.toInt()
    var time = 0

    fun secToTime(times: Int): Int {
        var minute = times
        minute = sec / time
        return minute
    }

    fun print() {
        when {
            sec > 60 && sec < 3600 -> time = 60
            sec > 3600 && sec < 86400 -> time = 3600
        }
        sec = secToTime(time)
        if (time == 60) {
            if (sec < 5 && sec % 10 != 1) {
                println("пользователь был $sec минуты назад")
            } else
                if (sec != 11 && sec % 10 == 1) {
                    println("пользователь был $sec минуту назад")
                } else println("пользователь был $sec минут назад")
        } else
            if (time == 3600) {
                if (sec < 5 && sec % 10 != 1) {
                    println("пользователь был $sec часа назад")
                } else
                    if (sec != 11 && sec % 10 == 1) {
                        println("пользователь был час назад")
                    } else println("пользователь был $sec часов назад")
            }
    }

    fun agoToTextcek() {
        if (sec > 60 && sec < 86400) print() else
            if (sec < 60) println("пользователь был только что") else
                if (sec > 86400 && sec < 172800) System.out.println("пользователь был сегодня") else
                    if (sec > 172800 && sec < 259200) System.out.println("пользователь был вчера")

    }

    agoToTextcek();
}
