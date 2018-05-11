package com.wenrui.newaspreview.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wenrui.newaspreview.R
import com.wenrui.newaspreview.toast
import kotlinx.android.synthetic.main.main_fragment.view.*

class MainFragment : Fragment(), Observer<User> {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        view.button.setOnClickListener({
            viewModel.increaseUserId()
        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.liveData.observe(this, this)
        viewModel.liveData.value = User()

    }

    override fun onChanged(t: User?) {
        view!!.message.text = (t?.id ?: "").toString()
        activity?.toast("aaaa")
    }

}


