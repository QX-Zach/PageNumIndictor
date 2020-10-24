# PageNumIndictor
数字页码指示器，可手动切换页码，更多、上一个、下一个、直接点击指定页码。
继承RecycleView，宽度根据子控件总宽度而定。上一个、下一个是单独添加的，不算在可点击页码数量内，不需要的话直接去代码里移除就可以了

**这个控件是为平板设备编写的，并没有适配手机。需要适配手机的话，直接修改布局文件item_page_num就可以了**

### 效果图

![效果1](https://github.com/QX-Zach/PageNumIndictor/blob/main/screenshot/screenshot1.png)

![效果2](https://github.com/QX-Zach/PageNumIndictor/blob/main/screenshot/screenshot2.png)

![效果3](https://github.com/QX-Zach/PageNumIndictor/blob/main/screenshot/scheenshot3.png)

### 可修改属性
* maxShowPage：页面最大显示的页码数量，包含更多按钮的数量，默认值：10
* totalPage：总页码数，默认值：1
* pageClickListener：页码选中回调

**设置maxShowPage/totalPage 必须调用refreshPageData()刷新数据，否则页面不会改变**