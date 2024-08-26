*PicNest - A Dynamic Photo Frame Application*

*Overview*  
PicNest is an interactive photo frame application that allows users to navigate smoothly through a collection of images with a sleek and minimalistic interface. The app uses simple and intuitive controls to cycle through images while displaying associated captions, making it perfect for showcasing memorable moments or favorite photos.

*Functionality*  

📸 *Image Navigation:*  
- PicNest features two navigation buttons ("Previous" and "Next") that let users scroll through a predefined set of images.

📝 *Image Captions:*  
- Each image is paired with a caption that updates dynamically as the user switches between images.

💻 *Java Code Implementation (MainActivity):*  
- The core logic is handled in MainActivity.java, focusing on:
  - An array of image names and captions.
  - Five ImageView components, one for each image.
  - Navigation using ImageButton controls for "Previous" and "Next".
  - Seamless image switching using setVisibility(View.VISIBLE/INVISIBLE) ensures only the active image is displayed.
  - Captions update based on the visible image, enhancing user engagement.

🖌 *XML Layout (activity_main.xml):*  
- The layout uses ConstraintLayout and includes:
  - A FrameLayout that stacks all ImageView components, enabling easy image switching.
  - A structure that ensures only one ImageView is visible at any time for a clean interface.
  - A LinearLayout at the bottom holds navigation buttons, while captions are centered above the image, creating a balanced design.
  - Customized background colors, fonts, and alignment for a polished UI.

*Key Features*  

✨ *Sleek UI:*  
- The design emphasizes a clean and user-friendly interface with easy-to-use controls.

🎯 *Smooth Transitions:*  
- Images transition smoothly without flickering, providing a seamless viewing experience.

🖊 *Customizable Captions:*  
- Captions dynamically update as users navigate between images.

---

PicNest combines simplicity with functionality, making it an ideal app for users seeking a straightforward photo frame experience on their Android device.
