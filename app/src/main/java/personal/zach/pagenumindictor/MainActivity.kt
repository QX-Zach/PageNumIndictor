package personal.zach.pagenumindictor

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pageNum.pageClickListener = object : PageNumIndictor.PageNumClick {
            override fun onPageSelect(pageIndex: Int) {
                Log.e(TAG, "onPageSelect: 选中页码：$pageIndex")
                tvPageIndex.text = "选中的页码：$pageIndex"
            }

        }
        pageNum.totalPage = 45
        pageNum.refreshPageData()
    }
}