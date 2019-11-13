package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
            val input1:String = car_price.text.toString()
            val input2:String = down_payment.text.toString()
            val input3:String = interest_rate.text.toString()
            val input4:String = interest_period.text.toString()

            val Carprice:Double = input1.toDouble()
            val DownPayment:Double = input2.toDouble()
            val InterestRate:Double = input3.toDouble()
            val InterestPeriod:Double = input4.toDouble()

            val carLoan:Double = Carprice - DownPayment
            val interest = carLoan * InterestRate * InterestPeriod
            val Monthly = (carLoan + interest) / InterestPeriod / 12

            Car_Loan.text = "%.2f".format(carLoan)
            Interest.text = "%.2f".format(interest)
            monthly_payment.text = "%.2f".format(Monthly)

        }
    }
}
