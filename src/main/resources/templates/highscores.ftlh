<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <div>
        <table>
            <tr>
                <th>nickname</th>
                <th>Trys</th>
            </tr>

        <#list users?sort_by("trys")?reverse?filter(trys -> trys.trys > 0) as user>
            <tr>
                <td>${user.nickname}</td>
                <td>${user.trys}</td>

            </tr>
        </#list>
    </table>
    <form action="/signIn" method="get">
        <input type="submit" value="back">
    </form>
</div>

</body>
</html>