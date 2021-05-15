# smart doc template

The smart doc template project is used to provide [smart-doc](https://github.com/smart-doc-group/smart-doc) projects with a replacement for interfaces that are not rendered correctly. It depends on the [smart-doc-maven-plugin](https://github.com/smart-doc-group/smart-doc-maven-plugin) project.

## Usage

1. Add a dependency to smart-doc-maven-plugin.

```xml

<plugin>
    <groupId>com.github.shalousun</groupId>
    <artifactId>smart-doc-maven-plugin</artifactId>
    <!--...-->
    <dependencies>
        <dependency>
            <groupId>net.xiaolanglang.doc</groupId>
            <artifactId>smart-doc-template</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
    <!--...-->
</plugin>
```

2. Modify the `smart-doc.json` file to add the `apiObjectReplacements` field.

```json
{
  "apiObjectReplacements": [
    {
      "className": "org.springframework.data.domain.Pageable",
      "replacementClassName": "net.xiaolanglang.doc.spring.PageableTemplate"
    }
  ]
}
```

3. Use `customRequestFields` to modify the description, default values, etc.

```json
{
  "customRequestFields": [
    {
      "name": "sort",
      "ownerClassName": "net.xiaolanglang.doc.spring.PageableTemplate",
      "desc": "sort field",
      "value": "createTime,desc"
    }
  ]
}
```

## Current templates

| template class                               | origin class                             |
| -------------------------------------------- | ---------------------------------------- |
| net.xiaolanglang.doc.spring.PageableTemplate | org.springframework.data.domain.Pageable |