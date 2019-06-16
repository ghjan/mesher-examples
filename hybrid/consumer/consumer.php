<?php

$name = getenv("TARGET");
if (empty($name)) {
    $name = "localhost:9080";
}
$url = "http://" . $name . "/hello";
//echo $name;
//echo "<br />";
//echo $url;
//echo "<br />";
$client = curl_init($url);
curl_setopt($client, CURLOPT_RETURNTRANSFER, true);
$response = curl_exec($client);

echo $name . " said: " . $response;

?>
