package com.example.questtugaslayout_0100

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_0100.ui.theme.QuestTugasLayout_0100Theme


@Composable
fun ActivityKeempat(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 18.sp,
            fontWeight = FontWeight.Light
        )

        Spacer(modifier = Modifier.height(20.dp))

        CardCustom(
            nama = stringResource(R.string.nama_1),
            noHp = stringResource(R.string.nohp_1),
            alamat = stringResource(R.string.alamat_1),
            backgroundColor = Color(0xFF3F51B5)
        )

        CardCustom(
            nama = stringResource(R.string.nama_2),
            noHp = stringResource(R.string.nohp_2),
            alamat = stringResource(R.string.alamat_2),
            backgroundColor = Color(0xFF00796B)
        )

        CardCustom(
            nama = stringResource(R.string.nama_3),
            noHp = stringResource(R.string.nohp_3),
            alamat = stringResource(R.string.alamat_3),
            backgroundColor = Color(0xFFD32F2F)
        )

        CardCustom(
            nama = stringResource(R.string.nama_4),
            noHp = stringResource(R.string.nohp_4),
            alamat = stringResource(R.string.alamat_4),
            backgroundColor = Color(0xFF6A1B9A)
        )

    }
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Text(
            stringResource(R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp),
        )
    }
}

@Composable
fun CardCustom(
    nama: String,
    noHp: String,
    alamat: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo UMY Kiri",
                modifier = Modifier.size(60.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = nama,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = noHp,
                    fontSize = 14.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = alamat,
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo UMY Kanan",
                modifier = Modifier.size(60.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActivityKeempatPreview() {
    QuestTugasLayout_0100Theme{
        ActivityKeempat()
    }
}