package edu.gvsu.cis.chaseapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChaseScreen() {

    val chaseBlue = Color(0xFF0B5DA8)

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rememberMe by remember { mutableStateOf(true) }
    var useToken by remember { mutableStateOf(false) }


    Box(modifier = Modifier.fillMaxSize()) {

        // Top blue background top 70%
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.70f)
                .background(chaseBlue)
        )

        // Bottom white background bottom 30%
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.30f)
                .align(Alignment.BottomCenter)
                .background(Color.White)
        )


        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(110.dp))

            // Chase logo
            Image(
                painter = painterResource(R.drawable.chase_logo),
                contentDescription = "Chase Logo",
                modifier = Modifier.height(40.dp)
            )

            // Spacer for Login Card
            Spacer(modifier = Modifier.height(150.dp))

            // White Login Box
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp),
                shape = RoundedCornerShape(6.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F7F9))
            ) {
                Column(modifier = Modifier.padding(18.dp)) {

                    Text(
                        text = "Enter your username",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = username,
                            onValueChange = { username = it },
                            singleLine = true,
                            modifier = Modifier.weight(1f)
                        )

                        // Scan icon
                        Image(
                            painter = painterResource(R.drawable.scan_icon),
                            contentDescription = "Scan",
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .size(26.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Enter your password",
                            color = Color.Gray,
                            fontSize = 14.sp,
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "Show",
                            color = chaseBlue,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = rememberMe,
                            onCheckedChange = { rememberMe = it }
                        )
                        Text("Remember me", fontSize = 16.sp)
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = useToken,
                            onCheckedChange = { useToken = it }
                        )
                        Text("Use token", fontSize = 16.sp)
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = chaseBlue),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text("Sign in", fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = "Forgot username or password?",
                        color = chaseBlue,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            Spacer(modifier = Modifier.height(0.dp))

            // Bottom links
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Sign up", color = chaseBlue)
                Text("  |  ", color = chaseBlue)
                Text("Open an account", color = chaseBlue)
                Text("  |  ", color = chaseBlue)
                Text("Privacy", color = chaseBlue)
                Text("  ...", color = chaseBlue)
            }

            Spacer(modifier = Modifier.weight(1f))

            // legal text
            Text(
                text = "Equal Housing Opportunity",
                color = Color.Gray,
                fontSize = 11.sp
            )

            Spacer(modifier = Modifier.height(0.dp))

            Text(
                text = "Deposit products provided by JPMorgan Chase Bank, N.A.\n" +
                        "Member FDIC\n" +
                        "Credit cards are issued by JPMorgan Chase Bank, N.A.\n" +
                        "Member FDIC\n" +
                        "© 2026 JPMorgan Chase & Co.",
                color = Color.Gray,
                fontSize = 11.sp,
                lineHeight = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Name
            Text(
                text = "Tristian Paquette",
                color = Color.Gray,
                fontSize = 12.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )
        }
    }
}
