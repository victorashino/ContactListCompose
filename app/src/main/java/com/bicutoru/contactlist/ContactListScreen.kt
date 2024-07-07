package com.bicutoru.contactlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ContactListScreen() {
    ContactList()
}

@Composable
private fun ContactList() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                fontSize = 32.sp,
                text = "Contact List"
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                modifier = Modifier
                    .size(32.dp),
                imageVector = Icons.Filled.Search,
                contentDescription = "Search Icon"
            )
        }
        ContactListContent() {

        }
    }
}

@Composable
private fun ContactListContent(
    onClick: (Contact) -> Unit
) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        ContactCard(
            contact = Contact(
                name = "Maria",
                phone = "(17)99503-2810",
                newMessages = 7,
                icon = R.drawable.sample1
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Gabriel",
                phone = "(17)99403-2810",
                newMessages = 12,
                icon = R.drawable.sample2
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Laura",
                phone = "(17)99303-2810",
                newMessages = 0,
                icon = R.drawable.sample3
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Maisa",
                phone = "(17)99203-2810",
                newMessages = 0,
                icon = R.drawable.sample4
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Gabi",
                phone = "(10)98303-2810",
                newMessages = 3,
                icon = R.drawable.sample5
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Sara",
                phone = "(15)99453-2810",
                newMessages = 1,
                icon = R.drawable.sample6
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Maite",
                phone = "(11)99663-2810",
                newMessages = 3,
                icon = R.drawable.sample7
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Caio",
                phone = "(17)98113-2810",
                newMessages = 4,
                icon = R.drawable.sample8
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Matheus",
                phone = "(18)99703-2810",
                newMessages = 135,
                icon = R.drawable.sample9
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "João",
                phone = "(13)99103-2810",
                newMessages = 0,
                icon = R.drawable.sample10
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Ana com dois ene",
                phone = "(17)98103-2810",
                newMessages = 11,
                icon = R.drawable.sample11
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Bruno",
                phone = "(17)98803-2810",
                newMessages = 4,
                icon = R.drawable.sample12
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Isabela",
                phone = "(17)99003-2810",
                newMessages = 313,
                icon = R.drawable.sample13
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Felipe",
                phone = "(11)98603-2810",
                newMessages = 0,
                icon = R.drawable.sample14
            )
        ) {
            onClick.invoke(it)
        }

        ContactCard(
            contact = Contact(
                name = "Nicole",
                phone = "(11)99603-2810",
                newMessages = 0,
                icon = R.drawable.sample15
            )
        ) {
            onClick.invoke(it)
        }
    }
}

@Composable
private fun ContactCard(
    contact: Contact,
    onClick: (Contact) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0x1AE5F0FF))
                .clickable { onClick.invoke(contact) },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
                    .size(50.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillWidth,
                painter = painterResource(id = contact.icon),
                contentDescription = "${contact.name} Icon"
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(
                    fontSize = 20.sp,
                    text = contact.name
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    fontSize = 16.sp,
                    text = contact.phone
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            if (contact.newMessages <= 0) {

            } else if (contact.newMessages > 99) {
                Box(
                    modifier = Modifier
                        .padding(24.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF94BDFF))
                        .padding(2.dp)
                        .width(24.dp)
                        .height(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        color = Color.Black,
                        text = "99+"
                    )
                }
            } else {
                Box(
                    modifier = Modifier
                        .padding(24.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF94BDFF))
                        .padding(2.dp)
                        .width(24.dp)
                        .height(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        color = Color.Black,
                        text = contact.newMessages.toString()
                    )
                }
            }
        }
    }
}
