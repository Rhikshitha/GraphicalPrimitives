package com.example.graphicalprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class SampleCanvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)


        val paint : Paint = Paint()
        paint.setColor(Color.RED)
        canvas?.drawPaint(paint)
        paint.setColor(Color.GREEN)
        canvas?.drawLine(10f,10f,300f,300f,paint)
        paint.setColor(Color.YELLOW)
        canvas?.drawCircle(800f,800f,200f,paint)
        paint.setColor(Color.BLACK)



      }




}