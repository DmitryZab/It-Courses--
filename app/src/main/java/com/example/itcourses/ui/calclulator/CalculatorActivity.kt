package com.example.itcourses.ui.calclulator

import android.widget.Button
import android.widget.TextView
import com.example.itcourses.R
import com.example.itcourses.ui.base.BaseActivity
import com.example.itcourses.utils.lazyUnsafe

class CalculatorActivity : BaseActivity<CalculatorView, CalculatorPresenter>(), CalculatorView {

    override val presenter: CalculatorPresenter = CalculatorPresenter(this)
    override val contentId: Int = R.layout.activity_calculator
    override var resultStroke : String = ""
    override var operation: String= ""

    private val inputTextView: TextView by lazyUnsafe { findViewById<TextView>(R.id.inputTextView) }
    private val answerTextView: TextView by lazyUnsafe { findViewById<TextView>(R.id.answerTextView) }

    private val buttonNum1: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum1) }
    private val buttonNum2: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum2) }
    private val buttonNum3: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum3) }
    private val buttonNum5: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum5) }
    private val buttonNum6: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum6) }
    private val buttonNum4: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum4) }
    private val buttonNum7: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum7) }
    private val buttonNum8: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum8) }
    private val buttonNum9: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum9) }
    private val buttonNum0: Button by lazyUnsafe { findViewById<Button>(R.id.buttonNum0) }
    private val buttonSub: Button by lazyUnsafe { findViewById<Button>(R.id.buttonSub) }
    private val buttonSum: Button by lazyUnsafe { findViewById<Button>(R.id.buttonSum) }
    private val buttonDiv: Button by lazyUnsafe { findViewById<Button>(R.id.buttonDiv) }
    private val buttonMult: Button by lazyUnsafe {findViewById<Button>(R.id.buttonMult) }

    private val buttonClear: Button by lazyUnsafe { findViewById<Button>(R.id.buttonClear) }
    private val buttonEqually: Button by lazyUnsafe { findViewById<Button>(R.id.buttonEqually) }

    override fun initViews() {
        super.initViews()
        buttonNum1.setOnClickListener { presenter.onNum1Click() }
        buttonNum2.setOnClickListener { presenter.onNum2Click() }
        buttonNum3.setOnClickListener { presenter.onNum3Click() }
        buttonNum4.setOnClickListener { presenter.onNum4Click() }
        buttonNum5.setOnClickListener { presenter.onNum5Click() }
        buttonNum6.setOnClickListener { presenter.onNum6Click() }
        buttonNum7.setOnClickListener { presenter.onNum7Click() }
        buttonNum8.setOnClickListener { presenter.onNum8Click() }
        buttonNum9.setOnClickListener { presenter.onNum9Click() }
        buttonNum0.setOnClickListener { presenter.onNum0Click() }

        buttonSub.setOnClickListener { presenter.onSubClick() }
        buttonSum.setOnClickListener { presenter.onSumClick() }
        buttonDiv.setOnClickListener { presenter.onDivClick() }
        buttonMult.setOnClickListener { presenter.onMultClick() }

        buttonClear.setOnClickListener { presenter.onClearClick() }
        buttonEqually.setOnClickListener { presenter.onEquallyClick() }
    }

    override fun showInputText(text: String) {
        inputTextView.text = text
    }

    override fun showAnswerText(text: String) {
        answerTextView.text = text
    }

    override fun addStroke(text: String){
        resultStroke += text
    }

    override fun clear(){
        resultStroke = ""
        operation = ""
    }

    override fun calculate() {
        var ansverStroke : List<String> = resultStroke.split("-", "+", "/", "*")
        var firstNumber : Double = ansverStroke[0].toDouble()
        var secondNumber : Double = ansverStroke[1].toDouble()
        when(operation){
            "-" ->  {
                resultStroke = (firstNumber - secondNumber).toString()
            }

            "*" ->  {
                resultStroke = (firstNumber * secondNumber).toString()
            }

            "/" ->  {
                resultStroke = (firstNumber / secondNumber).toString()
            }

            "+" ->  {
                resultStroke = (firstNumber + secondNumber).toString()
            }
        }
    }

}
