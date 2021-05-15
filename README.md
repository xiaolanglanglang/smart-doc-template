# smart doc template

The smart doc template project aim to provide the template for those interfaces that can notbe rendered by the [smart-doc](https://github.com/smart-doc-group/smart-doc) project. This requires the [smart-doc-maven-plugin](https://github.com/smart-doc-group/smart-doc-maven-plugin).

## Usage

1. Add the dependency to smart-doc-maven-plugin.

```xml

<plugin>
    <groupId>com.github.shalousun</groupId>
    <artifactId>smart-doc-maven-plugin</artifactId>
    <!--...-->
    <dependencies>
        <dependency>
            <groupId>net.xiaolanglang.doc</groupId>
            <artifactId>smart-doc-template</artifactId>
            <version>1.0</version>
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