package com.example.youtube

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.io.File

class Post (
	val content : String, image : File
)

class YoutubeItem (
	val id : Int, val title : String, val content : String, val video : String, val thumbnail : String
)

interface RetrofitService {

	@GET("youtube/list/")
	fun getYoutubeItemList(): Call<ArrayList<YoutubeItem>>

	@POST("youtube/list/")
	fun createStudent(
		@Body params: HashMap<String, Any>
		// HashMap : 키벨류형식의 맵이지만 사람이 해석할 수 없는 암호화된 Hash형식으로 보낸다고 이해한다.
	): Call<YoutubeItem>

	@POST("youtube/list/")
	fun easyCreateStudent (
		@Body student : YoutubeItem
	): Call<YoutubeItem>
}