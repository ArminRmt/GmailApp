package ap.example.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData (
    val icon : ImageVector? = null , val title: String? = null,
    val isDivider: Boolean = false, val isHeader:Boolean = false,
)
{
    object AllInboxes : DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All inbox"
    )
    object Primary : DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    object Social : DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )

    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.Tag,
        title = "Promotions",
    )

    object Starred : DrawerMenuData(
        icon = Icons.Outlined.StarOutline  ,
        title = "Starred",
    )

    object Snoozed : DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed",
    )

    object Important : DrawerMenuData(
        icon = Icons.Outlined.Label,
        title = "Important",
    )

    object Sent : DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent",
    )

    object Schedule : DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled",
    )

    object Outbox : DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox",
    )

    object Draft : DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts",
    )

    object AllMail : DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All Mail",
    )

    object Calender : DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calender",
    )

    object Contacts : DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts",
    )

    object Setting : DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings",
    )

    object Help : DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & FeedBack",
    )

    object Divider : DrawerMenuData(
        isDivider = true,
    )

    object HeaderOne : DrawerMenuData(
        isHeader = true,
        title = "ALL LABLES"
    )

    object HeaderTwo : DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )
}