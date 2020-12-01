<!DOCTYPE html>
<html>
<body>
  
<?php $name = $_POST['name'];
$email = $_POST['email'];
$message = $_POST['message'];
$formcontent="From: $name \n Message: $message";
$recipient = "emailaddress@here.com";
$subject = "Contact Form";
$mailheader = "From: $email \r\n";
message($recipient, $subject, $formcontent, $mailheader) or die("Error!");
echo "Thank You!";
?>

</body>
</html>
