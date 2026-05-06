# Java 21 Starter Project

একটি ব্লাংক Java 21 Maven প্রজেক্ট, GitHub Actions CI সহ।

## প্রজেক্ট স্ট্রাকচার

```
java21-starter/
├── .github/workflows/build.yml   # GitHub Actions CI
├── src/
│   ├── main/java/com/example/
│   │   └── Main.java
│   └── test/java/com/example/
│       └── MainTest.java
├── pom.xml
└── README.md
```

## লোকালি রান করুন

```bash
# Build
mvn clean package

# Run
java -jar target/java21-starter-1.0.0-SNAPSHOT.jar

# Test
mvn test
```

## GitHub-এ পুশ করুন

```bash
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/<your-username>/<repo-name>.git
git push -u origin main
```

Push করার পরে GitHub Actions অটোমেটিক বিল্ড ও টেস্ট চালাবে।
