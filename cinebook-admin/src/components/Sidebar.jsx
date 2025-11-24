import { Link } from "react-router-dom"

export default function AdminSidebar() {
  return (
    <div className="w-64 min-h-screen bg-[#CD2C58] text-white p-6 flex flex-col gap-6">
      <h1 className="text-2xl font-bold">CineBook Admin</h1>

      <nav className="flex flex-col gap-4">
        <Link to="/admin/dashboard" className="hover:text-[#8CE4FF]">
          Dashboard
        </Link>
        <Link to="/admin/movies" className="hover:text-[#8CE4FF]">
          Movies
        </Link>
        <Link to="/admin/screens" className="hover:text-[#8CE4FF]">
          Screens
        </Link>
        <Link to="/admin/showtimes" className="hover:text-[#8CE4FF]">
          Showtimes
        </Link>
        <Link to="/admin/bookings" className="hover:text-[#8CE4FF]">
          Bookings
        </Link>
      </nav>
    </div>
  )
}
