package com.example.nibavtestapplication

data class ListResponse(
    val result : String ,
    val data : Data
)

data class Data(
    val newslist : List<Dataa>
)

data class Dataa(
    val id : String ,
    val pname : String ,
    val is_favorite : String ,
    val position : String ,
    val title : String ,
    val details : String ,
    val source_logo : String ,
    val player_image_url : String
)


