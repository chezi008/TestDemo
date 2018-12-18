package com.chezi008.testdemo.adapter

import android.widget.TextView
import com.chezi008.testdemo.R

/**
 * @description ：
 * @author ：chezi008 on 2018/12/18 11:07
 * @email ：chezi008@163.com
 */
class SimpleAdater(list: MutableList<String>?, layoutId: Int) : BaseRVAdapter<String>(list, layoutId) {

    override fun bindData(holder: BaseViewHolder?, data: String?, positon: Int) {
        holder?.getView<TextView>(R.id.tvText)?.text = data
    }

}