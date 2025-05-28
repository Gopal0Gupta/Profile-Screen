package com.gopal.profilex.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.CreditScore
import androidx.compose.material.icons.filled.CurrencyRupee
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Message
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gopal.profilex.R

@Composable
fun ProfileScreen() {
    val backgroundColor = Color(0xFF0D0D0D)
    val textColor = Color.White

    Scaffold(
        containerColor = backgroundColor
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = textColor
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text("Profile", color = textColor, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                SupportButton()
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Profile Pic",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        "andaz Kumar",
                        color = textColor,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text("member since Dec, 2020", color = Color(0xFFB0B0B0), fontSize = 14.sp)
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .border(1.dp, Color.Gray, shape = CircleShape)
                        .size(40.dp)
                ) {
                    Icon(Icons.Default.Edit, contentDescription = "Edit", tint = textColor)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF1A1A1A), RoundedCornerShape(8.dp))
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.DirectionsCar, contentDescription = null, tint = textColor)
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        "get to know your vehicles, inside out",
                        color = Color(0xFFB0B0B0),
                        fontSize = 12.sp
                    )
                    Row {
                        Text(
                            "CRED garage",
                            color = textColor,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Icon(
                            Icons.Default.ArrowForward,
                            contentDescription = null,
                            tint = textColor
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(28.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.CreditScore,
                    contentDescription = "credit score",
                    tint = Color.LightGray
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text("credit score", color = Color.LightGray, fontSize = 14.sp)
                Text(text = " . REFRESH AVAILABLE", color = Color.Green, fontSize = 13.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text("757", color = Color.White, fontSize = 14.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Icon(Icons.Default.ArrowForward, contentDescription = null, tint = Color.Gray)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.CurrencyRupee,
                    contentDescription = "cashback",
                    tint = Color.LightGray
                )
                Spacer(modifier = Modifier.width(6.dp))
                ProfileRowItem("lifetime cashback", "₹3")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.AccountBalanceWallet,
                    contentDescription = "balance",
                    tint = Color.LightGray
                )
                Spacer(modifier = Modifier.width(6.dp))
                ProfileRowItem("bank balance", "check")
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text("YOUR REWARDS & BENEFITS", color = Color(0xFF9E9E9E), fontSize = 14.sp)
            Spacer(modifier = Modifier.height(12.dp))
            RewardItem("cashback balance", "₹0")
            Divider(thickness = 1.dp, color = Color.Gray)
            RewardItem("coins", "26,46,583")
            Divider(thickness = 1.dp, color = Color.Gray)
            RewardItem("win upto Rs 1000", "refer and earn")

            Spacer(modifier = Modifier.height(24.dp))
            Text("TRANSACTIONS & SUPPORT", color = Color(0xFF9E9E9E), fontSize = 14.sp)
            Spacer(modifier = Modifier.height(12.dp))
            RewardItem("all transactions", "")
        }
    }
}

@Composable
fun ProfileRowItem(title: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(title, color = Color.LightGray, fontSize = 14.sp)
        Spacer(modifier = Modifier.weight(1f))
        Text(value, color = Color.White, fontSize = 14.sp)
        Spacer(modifier = Modifier.width(12.dp))
        Icon(Icons.Default.ArrowForward, contentDescription = null, tint = Color.Gray)
    }
}

@Composable
fun RewardItem(title: String, value: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(title, color = Color.White, fontSize = 14.sp)
            Spacer(modifier = Modifier.weight(1f))
            Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color.Gray)
        }
        Text(value, color = Color.Gray, fontSize = 14.sp)
    }
}

@Composable
fun SupportButton() {
    val borderColor = Color.Gray
    val iconTint = Color.Gray
    val textColor = Color.Gray
    val backgroundColor = Color(0xFF0D0D0D)

    Row(
        modifier = Modifier
            .border(1.dp, borderColor, shape = RoundedCornerShape(50))
            .background(backgroundColor, shape = RoundedCornerShape(50))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            Icons.Default.Message,
            contentDescription = "Support Icon",
            tint = iconTint,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "support",
            color = textColor,
            fontSize = 14.sp
        )
    }
}
