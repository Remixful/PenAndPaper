<p align="center">
<img src="http://i.imgur.com/wg6YzXw.gif" />
 </p>
 
<h1 align="center">Pen And Paper</h1>

<h3 align="center"><em>Create JSON Written Books with ease</em></h3>


<h3>About:</h3>

Get ready to write!  
Pen And Paper is an API which allows developers to create and manipulate Written Books in a straightforward and effortless manner. Whether it be used for lore, guides or just good old fun - Pen And Paper will get the job done.

<h4>Dependencies:</h4>

[PowerNBT](https://www.spigotmc.org/resources/powernbt.9098/)

<h4>Links:</h4>

[Javadocs](https://remixful.github.io/PenAndPaper/)

<h2>How To Use:</h2>

````Java
WrittenBook wb = new WrittenBook();
// Write to the current page (page 0)
WrittenBookText text = wb.writeLine("Hello world!");
text.setColor(ChatColor.RED);
// writeLine adds a newline character at the end, while write does not
wb.write("This is line ");
wb.writeLine("2").setColor(ChatColor.DARK_PURPLE);
wb.write("&nLine 3");
````

You've now created the first page of your new Written Book. Thanks, Pen And Paper!

<img src="http://i.imgur.com/Hqjdksp.png" />


That wasn't so hard was it?
It's now time to publish our new Written Book and share it with the world!
```Java
ItemStack wbitem = wb.publish();
```

*TO BE CONTINUED*
