# Introduction To HTML And CSS

## What is HTML?

HTML stands for Hypertext Markup Language. It is a standardized system for tagging text files to achieve font, color,
graphic, and hyperlink
effects on World Wide Web pages.

### In Summary

- HTML stands for Hyper Text Markup Language
- HTML is the standard markup language for creating Web pages
- HTML describes the structure of a Web page
- HTML consists of a series of elements
- HTML elements tell the browser how to display the content

### Example

```html
 <!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
</head>
<body>

<h1>This is a header</h1>
<p>This is a paragraph</p>

</body>
</html> 
```

- The `<!DOCTYPE html>` declaration defines that this document is an HTML5 document
- The `<html>` element is the root element of an HTML page
- The `<head>` element contains meta information about the HTML page
- The `<title>` element specifies a title for the HTML page (which is shown in the browser's title bar or in the page's
  tab)
- The <body> element defines the document's body, and is a container for all the visible contents, such as headings,
  paragraphs, images, hyperlinks, tables, lists, etc.
- The `<h1>` element defines a large heading
- The `<p>` element defines a paragraph

## What is CSS?

CSS is the language for describing the presentation of Web pages, including colors, layout, and fonts. It allows one to
adapt the presentation to different types of devices, such as large screens, small screens, or printers.

CSS can be added to HTML documents in 3 ways:

- Inline - by using the style attribute inside HTML elements
- Internal - by using a `<style>` element in the `<head>` section
- External - by using a `<link>` element to link to an external CSS file

### Example - Inline CSS

```html
 <h1 style="color:blue;">A Blue Heading</h1>

<p style="color:red;">A red paragraph.</p>

```

### Example - Internal CSS

```html
 <!DOCTYPE html>
<html>
<head>
    <style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
    </style>
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html> 
```

### Example - External CSS

```html
 <!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>

```

### "styles.css"

```
body {
  background-color: powderblue;
}
h1 {
  color: blue;
}
p {
  color: red;
}
```

## HTML Classes

The HTML id attribute is used to specify a unique id for an HTML element. You cannot have more than one element with the same id in an HTML document.

The class attribute is often used to point to a class name in a style sheet. It can also be used by a JavaScript to access and manipulate elements with the specific class name.

## HTML Id

The HTML id attribute is used to specify a unique id for an HTML element. You cannot have more than one element with the same id in an HTML document.

The id attribute is used to point to a specific style declaration in a style sheet. It is also used by JavaScript to access and manipulate the element with the specific id.

