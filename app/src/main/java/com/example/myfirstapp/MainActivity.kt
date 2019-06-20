package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView;
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Collections
import java.lang.Math

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var raffleList: ArrayList<Int> = ArrayList()

        var btn: Button = findViewById(R.id.button)

        var input = rando()
        text_view_2.setText("Input: " + "$input")

        btn.setOnClickListener {
            raffleList.add(input)
            text_view_1.setText("${raffleList.sorted()}")
            input = rando()
            text_view_2.setText("Input: " + "$input")
        }
    }
}

fun rando(): Int {
    return (1023*Math.random()).toInt()
}
/*
class Node<Int>(value: Int) {
    var content: Int = value
    var prev: Node<Int>? = null
    var next: Node<Int>? = null
}

class LinkedList<Int> {
    private var head: Node<Int>? = null


    fun last(): Node<Int>? {
        var tmp: Node<Int>? = head

        if(tmp == null) return null

        if(tmp?.next != null) {
            tmp = tmp.next
        }
        return tmp
    }

    fun append(value: Int) {
        var new: Node<Int>? = Node(value)
        var tmp: Node<Int>? = head
        if(head == null) {
            head == new
        } else {
            while(tmp?.next != null) {
                var prev: Node<Int>? = tmp.prev
                var x: Int = value
                var y: Int = tmp.content
                if(x < y) {
                    tmp.prev = new
                    if(prev != null) {
                        prev.next = new
                    }
                    break
                }
                tmp = tmp.next
            }
            tmp?.next = new
            new?.prev = tmp
        }
    }
}
*/

/*
var raffle: LinkedList<Int> = LinkedList()
raffle.append(13)
print(raffle)

raffle.append(34)
print(raffle)

raffle.append(23)
print(raffle)
*/
