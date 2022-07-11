package edu.bu.projectportal

data class Project(val id: Int, var title: String, var description: String, var author1: String, var author2: String, var author3: String, var link1: String, var link2: String, var link3: String, var key1: String, var key2: String, var key3: String){
    companion object {
        var project = Project(0, "Weather Forecast", "Weather Forcast is an app that reports today's weather.", "Author No.1", "Author No.2", "Author No. 3","https://github.com/CS683/projectportallab", "https://www.youtube.com", "https://developer.android.com/", "weather", "Forecast", "cast")
    }

//        var projects = listOf(
//            Project(0, "Weather Forecast", "Weather Forcast is an app ..."),
//            Project(1, "Connect Me", "Connect Me is an app ... "),
//            Project(2, "What to Eat", "What to Eat is an app ..."),
//            Project(3, "Project Portal", "Project Portal is an app ..."))
//    }
}