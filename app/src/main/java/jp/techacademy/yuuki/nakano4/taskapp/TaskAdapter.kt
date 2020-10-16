package jp.techacademy.yuuki.nakano4.taskapp

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class TaskAdapter(context: Context): BaseAdapter(){
    private val mLayoutInflater: LayoutInflater
    var taskList = mutableListOf<Task>()

    init{
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return taskList.size
    }

    override fun getItem(position: Int): Any {
        return taskList[position]
    }

    override fun getItemId(position: Int): Long {
        return taskList[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(R.layout.list3, null)

        val textView1 = view.findViewById<TextView>(R.id.text1)
        val textView2 = view.findViewById<TextView>(R.id.text2)
        val textView3 = view.findViewById<TextView>(R.id.text3)

        textView1.text = taskList[position].title

        textView2.text = taskList[position].category

        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.JAPANESE)
        val date = taskList[position].date
        textView3.text = simpleDateFormat.format(date)

        return view
    }





}