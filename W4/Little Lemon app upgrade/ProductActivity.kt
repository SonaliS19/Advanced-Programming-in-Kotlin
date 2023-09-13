package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.littlelemon.menu.MainActivity.Companion.KEY_CATEGORY
import com.littlelemon.menu.MainActivity.Companion.KEY_IMAGE
import com.littlelemon.menu.MainActivity.Companion.KEY_PRICE
import com.littlelemon.menu.MainActivity.Companion.KEY_TITLE

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = intent.getStringExtra(KEY_TITLE)
        val price = intent.getDoubleExtra(KEY_PRICE, 0.0)
        val description = intent.getStringExtra(KEY_CATEGORY)
        val image = intent.getIntExtra(KEY_IMAGE, 0)

        val productItem =
            ProductItem(title.toString(), price, description.toString(), image)
        setContent { ProductDetails(productItem) }
    }
}