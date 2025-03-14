package cn.ac.lz233.tarnhelm.ext.template

import android.content.Context
import android.view.View
import cn.ac.lz233.tarnhelm.extension.api.ExtContext
import cn.ac.lz233.tarnhelm.extension.api.ExtService

class ExtServiceImpl(extContext: ExtContext): ExtService(extContext) {

    override fun onExtInstall() {
        TODO("Add your code here")
    }

    override fun onExtUninstall() {
        TODO("Add your code here")
    }

    override fun onCheckUpdate(): String {
        TODO("Add your code here")
    }

    override fun onHandleString(charSequence: CharSequence?): String {
        TODO("Add your code here")
    }

    override fun onRequestConfigurationPanel(context: Context?): View {
        TODO("Add your code here")
    }

}