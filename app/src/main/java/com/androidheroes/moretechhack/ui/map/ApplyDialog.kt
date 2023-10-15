package com.androidheroes.moretechhack.ui.map

import android.content.Context
import android.os.Bundle
import android.view.View
import com.androidheroes.moretechhack.R
import com.androidheroes.moretechhack.data.BankInfo
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class ApplyDialog(
    private val bankAddress: BankInfo,
    context: Context
) :
    BottomSheetDialog(context, R.style.TransparentBottomSheet) {

    override fun onCreate(savedInstanceState: Bundle?) {
        val contentView = View.inflate(context, R.layout.apply_dialog, null)
        setContentView(contentView)
        super.onCreate(savedInstanceState)



        contentView.rootView.findViewById<MaterialButton>(R.id.apply).setOnClickListener {
            Snackbar.make(contentView.rootView, "Вы успешно встали в очередь в отделение, ваш номер 5, время ожидания 3 минуты", Snackbar.LENGTH_LONG).show()
        }

    }

    override fun onStart() {
        super.onStart()
    }

    companion object {
        fun newInstance(address: BankInfo, context: Context): ApplyDialog {
            val dialog = ApplyDialog(address, context)
            dialog.show()
            return dialog
        }
    }
}