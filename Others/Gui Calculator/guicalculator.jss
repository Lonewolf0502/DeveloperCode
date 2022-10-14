<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blogs</title>
    <link rel="stylesheet" href="index.css">
    <link href="https://fonts.googleapis.com/css2?family=Bree+Serif&family=Caveat&family=Dancing+Script&family=Lobster&family=Poppins&family=Raleway:wght@100&family=Ubuntu:wght@300&display=swap" rel="stylesheet">
</head>

<body>
    <div class="common" id="homepage">
        <header>
            <nav class="navbar">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#blog">Blog</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </nav>
        </header>
        <section>
            <h1>Discover the best solutions!!</h1>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Laboriosam alias optio vitae iste beatae
                voluptatem cum iusto assumenda corrupti veniam, quasi commodi. Natus laudantium facere ea blanditiis
                repellat a quos repellendus sequi odio. Est atque molestias ullam quidem laborum quia exercitationem
                porro sed enim aut dignissimos dicta eius eum, fuga animi blanditiis sapiente explicabo. Quam ratione,
                quidem nemo, aspernatur veniam sed corporis omnis, pariatur sit saepe totam est aperiam atque architecto
                error commodi. Tempora corporis vero quia mollitia ipsa explicabo iusto debitis alias vel ipsum,
                repudiandae, dolore eum enim soluta fugiat distinctio non veritatis doloribus accusantium impedit
                voluptates error laborum.</p>
        </section>
        <button class="btn"><a href="signup.html" target="_blank">Sign Up</a></button>
    </div>

    <div class="common" id="about">
        <h1>About Us</h1>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sunt ullam, voluptatum illum provident aut culpa
            inventore totam sed tenetur accusamus consequuntur non facilis unde, earum architecto voluptatem quae
            tempora cum consequatur dolorum facere perspiciatis officiis recusandae tempore! Debitis at doloremque
            doloribus incidunt commodi deleniti hic illum consequuntur atque, culpa ea ab eligendi qui ut animi,
            expedita nemo quia architecto. Corporis earum nesciunt sint sed numquam eligendi non! Labore soluta tenetur,
            excepturi magnam impedit quibusdam sit corporis molestias voluptatem quaerat tempora doloremque.</p>
    </div>

    <div class="common" id="blog">
        <h1>New blogs are coming soon....</h1>
        <img src="pen_remo.png">
    </div>

    <div class="common" id="contact">
        <div class="container">

            <h1>Not able to find the solutions?</h1>
            <h2>Contact us we will surely resolve your issues</h2>
            <form action="#" class="contactform">
                <div>
                    <span class="details">Name:</span><input type="text" name="myname" id="name"
                        placeholder="Your Name" required>
                </div>
                <div>
                    <span class="details">Gender:</span>
                    <div class="category">
                        <label class="gender">Male
                            <input type="radio" name="radio" checked>
                            <span class="check"></span>
                        </label>
                        <label class="gender">Female
                            <input type="radio" name="radio">
                            <span class="check"></span>
                        </label>
                        <label class="gender">Other
                            <input type="radio" name="radio">
                            <span class="check"></span>
                        </label>
                    </div>
                </div>
                <div>
                    <span class="details">Email:</span>
                        placeholder="Your email" required>
                </div>
                <div>
                    <span class="details">Contact No:</span>
                    <input type="tel" id="phone" name="phone" placeholder="Your contact no"  required>
                </div>
                <div>
                    <span class="details">Describe your problem:</span>
                    <textarea name="" id="" cols="30" rows="10" placeholder="Write here"></textarea>
                </div>
                <div class="button">
                    <input type="submit" value="Submit Now">
                </div>
        </div>

        </form>
    </div>

</body>

</html>
