## Java Photography Competition API

--------------

## Endpoints For Judges

```GET http://localhost:8080/judges ```
#### Expected Response: ```200 OK```
```
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Smith",
        "expertise": "biologist"
    },
    {
        "id": 2,
        "firstName": "Mila",
        "lastName": "Andrevska",
        "expertise": "math"
    },
    {
        "id": 3,
        "firstName": "JAOOO",
        "lastName": "TOTOTOT",
        "expertise": "geografy"
    }
]
```

```POST http://localhost:8080/judges```


```
{
    "firstName": "Narcis2",
    "lastName": "Nacev2",
    "expertise": "dota"
}
```

#### Expected Response: ```200 OK```
```
{
    "id": 4,
    "firstName": "Narcis2",
    "lastName": "Nacev2",
    "expertise": "dota"
}
```

```PUT http://localhost:8080/judges/{SOME ID}```


```
{
    "firstName": "Risto",
    "lastName": "Kacunkov2",
    "expertise": "Lebar"
}
```
#### Expected Response: ```200 OK```
```
{
    "id": 3,
    "firstName": "Risto",
    "lastName": "Kacunkov2",
    "expertise": "Lebar"
}
```

```DELETE http://localhost:8080/judges/{SOME ID}```
#### Expected Response: ```200 OK``` 

----------------
## Endpoints For Submissions

```GET http://localhost:8080/submissions ```
#### Expected Response: ```200 OK```
```
[
    {
        "id": 1,
        "title": "Butterfly",
        "category": "PORTRAIT",
        "uploadedAt": "2025-06-02",
        "photographerName": "Narcis",
        "imageUrl": "https//facebook.com"
    },
    {
        "id": 2,
        "title": "Nature",
        "category": "LANDSCAPE",
        "uploadedAt": "2025-06-02",
        "photographerName": "Koce",
        "imageUrl": "https//instagram.com"
    }
]
```

```POST http://localhost:8080/submissions```

```
{
    "title": "Grape",
    "category": "Nacev2",
    "photographerName": "Risto",
    "imageUrl": "https//:facebook.com"
}
```
#### Expected Response: ```200 OK```
```
{
    "id": 7,
    "title": "Gra1pe",
    "category": "Nac2ev2",
    "uploadedAt": null,
    "photographerName": "Risto",
    "imageUrl": "https//:facebook.com"
}
```

```PUT http://localhost:8080/submissions/{SOME ID}```

```
{
    "title": "Grape",
    "category": "Nacev2",
    "photographerName": "Risto",
    "imageUrl": "https//:facebook.com"
}
```
#### Expected Response : ```200 OK```
```
{
    "id": 1,
    "title": "Gra1pe",
    "category": "Nac2ev2",
    "uploadedAt": null,
    "photographerName": "Risto",
    "imageUrl": "https//:facebook.com"
}
```


```DELETE http://localhost:8080/submissions/{SOME ID}```

---------------
## Endpoints for Scores

```
POST http://localhost:8080/submissions/{SubmissionId}/judges/{JudgeID}/scores
```
#### Body:
```
{
    "value": 5,
    "comment": "average"
}
```

#### Expected Response:
```
{
    "id": 11,
    "value": 5,
    "comment": "average",
    "judge": {
        "id": 1,
        "firstName": "John",
        "lastName": "Smith",
        "expertise": "biologist"
    },
    "submission": {
        "id": 1,
        "title": "Butterfly",
        "category": "PORTRAIT",
        "uploadedAt": "2025-06-02",
        "photographerName": "Narcis",
        "imageUrl": "https//facebook.com"
    }
}
```