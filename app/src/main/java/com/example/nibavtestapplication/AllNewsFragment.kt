package com.example.nibavtestapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.nibavtestapplication.api.ApiClient
import com.example.nibavtestapplication.databinding.FragmentAllNewsBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllNewsFragment : Fragment() , AllNewsAdapter.Callback {

    lateinit var binding : FragmentAllNewsBinding
    private var allNewsAdapter : AllNewsAdapter? = null
    private var frame : Dataa? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        binding = FragmentAllNewsBinding.inflate(layoutInflater)
        getListObserver()
        return binding.root
    }

    private fun getListObserver() {
        val call : Call<ListResponse> = ApiClient.getClient.getCategories()
        call.enqueue(object : Callback<ListResponse> {
            override fun onResponse(call: Call<ListResponse>, response: Response<ListResponse>) {
                response.body().let {
                    val fData = it!!.data.newslist

                    allNewsAdapter = AllNewsAdapter(fData , requireContext() , this@AllNewsFragment)
                    binding.allNewRV.adapter = allNewsAdapter
                }
            }

            override fun onFailure(call: Call<ListResponse>, t: Throwable) {
                Toast.makeText(requireContext(), "Failed", Toast.LENGTH_SHORT).show()
            }


        })
    }

    override fun imageTCategoryClicked() {
        TODO("Not yet implemented")
    }


}